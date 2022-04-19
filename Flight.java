public class Flight {
    private int number;
    private String destination;

    public Flight(){
        number=0;
        destination=null;
    }
    public Flight(int number, String destination){
        if (number>0 && !destination.equals(null)){
            this.number=number;
            this.destination=destination;
        }
        else {
            this.number=0;
            this.destination=null;
        }
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
    public void display(){
        System.out.println(number+","+destination);
    }
}
