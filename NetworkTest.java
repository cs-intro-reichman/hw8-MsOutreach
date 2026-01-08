public class NetworkTest {
    public static void main(String[] args) {
        System.out.println("Testing the Network class...\n");

        System.out.println("...To get started, creating a dummy network for testing the toString and getUser methods...\n");
        Network dummyNet = new Network(100, true);
        System.out.println(dummyNet);

        System.out.println("Bar is a user in this network: " + ((dummyNet.getUser("Bar") != null) ? true : false));
        System.out.println("Gil is a user in this network: " + ((dummyNet.getUser("Gil") != null) ? true : false));
     
        System.out.println("\n...Now starts the serious testing...");
        
        // Creates a network with a maximum capacity of 1000 users
        Network net = new Network(1000);

        // Adds Users and follows relationships
        System.out.println("\n...Adding Users...");
        net.addUser("Alex");
        net.addUser("Orly");
        net.addUser("Idan");
        net.addUser("Keren");
        net.addUser("Neta");
        net.addUser("Zohar");
        net.addUser("Or");
        net.addUser("Uri");
        net.addUser("Maya");

        System.out.println("\n...Adding follows relationships...");
        net.addFollowee("Alex", "Keren");
        net.addFollowee("Alex", "Neta");
        net.addFollowee("Alex", "Zohar");
        net.addFollowee("Orly", "Zohar");
        net.addFollowee("Orly", "Or");
        net.addFollowee("Orly", "Uri");
        net.addFollowee("Orly", "Maya");
        net.addFollowee("Idan", "Or");
        net.addFollowee("Idan", "Zohar");
        net.addFollowee("Idan", "Neta");

        System.out.println(net);

        System.out.println("\n...Suggesting to Alex which user to follow...");
        System.out.println("Alex: based on our social network analysis, we recommend to follow " + net.recommendWhoToFollow("Alex"));
        
        System.out.println("\n...Finding the most popular user...");
        System.out.println("The most popular user is: " + net.mostPopularUser());

        System.out.println("\nAll Network class tests completed.");
    }
}
