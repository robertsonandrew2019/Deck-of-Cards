public class Main {

    public static int[][] deck;
    public static int clubs = 0;
    public static int diamonds = 1;
    public static int hearts = 2;
    public static int spades = 3;
    public static int jack = 11;
    public static int queen = 12;
    public static int king = 13;
    public static int ace = 1;

    public static void main(String[] args) {
        // write your code here
        deck = new int[4][13]; //suit rows x number columns
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[0].length; j++) {
                deck[i][j] = j + 1;
            }
        }
        int clubs = 0;
        int diamonds = 1;
        int hearts = 2;
        int spades = 3;
        int jack = 11;
        int queen = 12;
        int king = 13;
        int ace = 1;
        sortDiamonds();
    }

    public static void sortDiamonds() {
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[0].length; j++) {
                if (i == 1 || j == (6-1)) { //parameter for sorting //6-1 to adjust for array size starting at 0
                    int printElement = deck[i][j];
                    int suit = i;
                    String suits;
                    if(i == 0){suits = "clubs";}
                    else if(i == 1){suits = "diamonds";}
                    else if(i == 2){suits = "hearts";}
                    else{suits = "spades";}
                    if(printElement == 1){System.out.printf("ace of %s\n",suits);}
                    else if(printElement == 11){System.out.printf("jack of %s\n", suits);}
                    else if(printElement == 12){System.out.printf("queen of %s\n", suits);}
                    else if(printElement == 13){System.out.printf("king of %s\n", suits);}
                    else {System.out.printf("%d of %s\n", printElement, suits);}
                }
            }
        }

    }
}

//jack hearts/spades king diamonds