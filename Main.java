public class Main {

    public static int[][] deck

    public static void main(String[] args) {
        // write your code here
        deck = new int[4][13]; //suit rows x number columns
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[0].length; j++) {
                deck[i][j] = j + 1;
            }
        }
        sortDiamonds();
    }

    public static void sortDiamonds() {
        for (int i = 0; i < deck.length; i++) {
            for (int j = 0; j < deck[0].length; j++) {
                if ((i > 0 && i < 3) && ((j > 9 || j < 1))) { //parameter for sorting //j-1 to adjust for array size starting at 0 //example of red face cards
                    int printElement = deck[i][j];
                    int suit = i; String suits;
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
