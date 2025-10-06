public class AnonymeUser {
    public static class AnonymousUser implements User {
        private String id;

        public AnonymousUser(String id) {
            this.id = id;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public void displayInfo() {
            System.out.println("Vous avez une anonyme de: " + id);
        }
    }

}
