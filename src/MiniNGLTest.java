public class MiniNGLTest {
    public static void main(String[] args) {

        RegistreUser.RegisteredUser alice = new RegistreUser.RegisteredUser("u001", "Bob", "Randria", "alice@gmail.com");
        Publication   pub = new Publication("pub001", alice);

        RegistreUser.RegisteredUser bozy = new RegistreUser.RegisteredUser("U002", "KIala", "Bozy","bozy@gmail.com");
        Publication publication  = new Publication("pub002", bozy);


        pub.addMessage(new Message("Coucou Alice !", false, new AnonymeUser.AnonymousUser("anon123")));
        pub.addMessage(new Message("Tu es géniale !", true, new AnonymeUser.AnonymousUser("anon456")));
        pub.addMessage(new Message("Merci pour ton aide", false, alice));
        pub.addMessage(new Message("comment se passe ton rendez-vous ?", false, bozy));

        pub.displayAuteurs();

    }


}

