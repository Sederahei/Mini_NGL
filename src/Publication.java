
import java.util.ArrayList;
import java.util.List;

    public class Publication {
        private String id;
        private List<Message> messages;

        public Publication(String id, User proprietaire) {
            this.id = id;
            this.messages = new ArrayList<>();
        }

        public void addMessage(Message message) {
            messages.add(message);
        }

        public void displayAuteurs() {
            System.out.println("Auteurs des messages pour la publication " + id + ":");
            for (Message msg : messages) {
                msg.getAuthor().displayInfo();
            }
        }
    }
