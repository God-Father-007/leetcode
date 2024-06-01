class Twitter {
    
    class User{
        int userId;
        LinkedList<Tweet> tweets;
        Set<Integer> follows;

        User(int id) {
            this.userId = id;
            tweets = new LinkedList<>();
            follows = new HashSet<>();
        }
    }

    class Tweet{
        int tweetId;
        int time;
        Tweet( int id, int time ) {
            this.tweetId = id;
            this.time = time;
        }
    }

    Map<Integer,User> users;
    int timeLine;

    private void addUserIfNew( int id ) {
        if( !users.containsKey( id ) ) {
            users.put( id, new User(id) );
        }
    }

    private void filterTweets(int id, PriorityQueue<Tweet> p) {
        User user = users.get( id );
        filterTweets( user, p );
    }
    private void filterTweets(User user, PriorityQueue<Tweet> p) {
        for( Tweet t : user.tweets ) {
            p.add(t);
            if( p.size() > 10 ) { p.remove(); }
        }
    }

    public Twitter() {
        users = new HashMap<>();
        timeLine = 0;
    }
    
    public void postTweet(int userId, int tweetId) {
        addUserIfNew(userId);
        User user = users.get( userId );
        timeLine++;
        user.tweets.addFirst( new Tweet(tweetId,timeLine) );
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> p = new PriorityQueue<>( (a,b) -> a.time > b.time ? 1 : -1 );
        List<Integer> ans = new ArrayList<>();
        User user = users.get( userId );
        if( user == null ) { return ans; }
        filterTweets( user, p );
        for( int fId : user.follows ) {
            filterTweets( fId, p );
        }
        while( p.size() > 0 ) { ans.add( p.remove().tweetId ); }
        Collections.reverse(ans);
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        addUserIfNew(followerId);
        addUserIfNew(followeeId);
        User user = users.get( followerId );
        user.follows.add( followeeId );
    }
    
    public void unfollow(int followerId, int followeeId) {
        addUserIfNew(followerId);
        addUserIfNew(followeeId);
        User user = users.get( followerId );
        user.follows.remove( followeeId );
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */