package creational.builder;
public class Booking {

    private String date;
    private String service;
    private String note;

    private Booking(BookingBuilder builder){
        this.date = builder.date;
        this.service = builder.service;
        this.note = builder.note;
    }

    public String toString(){
        return date + " | " + service + " | " + note;
    }

    public static class BookingBuilder {

        private String date;
        private String service;
        private String note;

        public BookingBuilder setDate(String date){
            this.date = date;
            return this;
        }

        public BookingBuilder setService(String service){
            this.service = service;
            return this;
        }

        public BookingBuilder setNote(String note){
            this.note = note;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }
}
