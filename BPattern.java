public class BPattern {
    public static void main(String[] args) {
        String[][] star = new String[7][5];

        for(int i = 0; i < star.length; i++){
            for(int j = 0; j < star[i].length; j++){
                if (i == 0 || i == 3 || i == 6){
                    star[i][j] = "* ";
                } else if (j == 0 || j == 4)  {
                    star[i][j] = "* ";
                } else {
                    star[i][j] = "  ";
                }
            }
        }

        star[0][4] = "  ";
        star[6][4] = "  ";

        for (String[] row : star){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

    }
}
