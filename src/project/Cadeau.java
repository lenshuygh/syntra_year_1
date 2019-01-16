package project;

public class Cadeau {
    private static int count;
    private int id;
    private String person;
    private String receiver = "";
    private String gift ;

    {
        count++;
    }

    public Cadeau (String person, String gift){
        this.id = count;
        this.setPerson(person);
        this.setGift(gift);
    }

    private void setGift(String gift) {
        this.gift=gift;
    }

    private void setPerson(String person) {
        this.person = person;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPerson() {
        return this.person;
    }
    public String getReceiver() {
        return this.receiver;
    }

    public String getGift(){
        return this.gift;
    }
    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Cadeau{" +
                "#" + id +
                ": person='" + person + '\'' +
                ", gift='" + gift + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }

}

