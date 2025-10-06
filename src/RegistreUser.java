public class RegistreUser {

    public static class RegisteredUser implements User {
        private String id;
        private String nom;
        private String prenom;
        private String email;

        public RegisteredUser(String id, String nom, String prenom, String email) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
        }
        @Override
        public String getId() {
            return id;
        }

        @Override
        public void displayInfo() {
            System.out.println(
                    "Inscrit par: " + id + " - "
                            + nom + " "
                            + prenom + " ("
                            + email + ")");
        }
    }

}
