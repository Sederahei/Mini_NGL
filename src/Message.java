import java.time.LocalDateTime;

    public class Message {
        private String text;
        private LocalDateTime timestamp;
        private boolean isConfidential;
        private User author;

        public Message(String text, boolean isConfidential, User author) {
            this.text = text;
            this.isConfidential = isConfidential;
            this.author = author;
            this.timestamp = LocalDateTime.now();
        }

        public User getAuthor() {
            return author;
        }

        public boolean isConfidential() {
            return isConfidential;
        }

        public String getText() {
            return text;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }


