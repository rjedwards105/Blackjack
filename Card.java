public class Card
{
    String name;
    int value;
    String shape;
    boolean used = false;
    int id;
    String symbol;

    public Card(int n, String s, int z) {
        if (n > 1 && n < 11) {
            this.name = Integer.toString(n);
            this.value = n;
            this.symbol = this.name;
        } else if (n > 10) {
            this.value = 10;
            if (n == 11) {
                this.name = "Jack";
                this.symbol = "J";
            } else if (n == 12) {
                this.name = "Queen";
                this.symbol = "Q";
            } else if (n == 13) {
                this.name = "King";
                this.symbol = "K";
            }
        } else if (n == 1) {
            this.value = 1;
            this.name = "Ace";
            this.symbol = "A";
        }
        this.shape = s;
        this.id = z;
        //	System.out.println("New Card : " + name + " of " + shape + " (id = " + id + ")");
    }

    public void setUsed() {
        used = true;
        //	System.out.println("The Card  " + name + " of " + shape + " is now used");
    }

    public void setNotUsed() {
        used = false;
        //	System.out.println("The Card  " + name + " of " + shape + " is now not used");
    }
}
