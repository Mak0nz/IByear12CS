package topic05learningaids.queues;

public class Message {
    // --- Attributes (state) ---
    String title;

    String body;

    String contact;

    boolean isRead;

    // --- Constructors ---
    public Message(String title, String body, String contact) {
        this.title = title;
        this.body = body;
        this.contact = contact;
    }

    // --- Behaviour ---
    public void read() {
        this.isRead = true;
    }
}