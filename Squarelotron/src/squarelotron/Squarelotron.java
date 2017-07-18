/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarelotron;


/**
 *
 * @author Roby
 */
public class Squarelotron {
    int[][] squarelotron;
    int size;
    
    public Squarelotron(int n){
        int j = 0;
        size = n;
        squarelotron = new int[n][n];
        for (int x = 0; x <= n-1;x++){
            for(int y = 0; y<= n-1; y++){
                j = j + 1;
                squarelotron[x][y] = j;
            }   
        }
    }
    
    public void printSquarelotron(){
        for (int x = 0; x <= size-1;x++){
            System.out.println("");
            for(int y = 0; y<= size-1; y++){
                System.out.print(squarelotron[x][y] + "|");  
        } 
        }
    }
    public Squarelotron upsideDownFlip(int ring){
        Squarelotron flip = new Squarelotron(size);
        int topI = -(1-ring);
        System.out.println("TopI:" + topI);
        int leftI = -(1-ring);
        System.out.println("LeftI:" + leftI);
        int rightI = (size-ring);
        System.out.println("RightI:" + rightI);
        int midI = size/2;
        System.out.println("MidI:" + midI);
        int ringSize = size/2 + 1;
        System.out.println("Ringsize:" + ringSize);
        //the second dimension index stays the same, the row however changes
        //depending on the distance to the center axis
        //squarelotron[same + 2*(distance to center axis)][same]
        //distance to center axis = floor division and add one, that's the spot
        
        //center of squarelotron equation: size/2 as an int is the center
        //the distance from the center is [center index - current position][stays the same for upside down flip]
        //the ring size is = size/2 + 1 as an int if odd, even will mean it stays as size/2
        //double the distance from the center is where the number should move if odd, if even it'll be double - 1
        //putting it all together [2((size/2) - current index)] if odd, if even [2((size/2) - current index) - 1][same]
        
        //RING MECHANICS
        //[-(1 - specified ring)][-(1 - specified ring] - Top left
        //[-(1 - specified ring)][size-specifiedRing] - Top right
        //[size-specifiedRing][1 - specified ring] - Bottom left
        //[size-specifiedRing][size-specifiedRing] - Bottom right
        //Only has to go up to half of the squarelotron
        
        //even cases
        if (size % 2 == 0){
            if(ringSize >= ring){
                //top row - Index -> Right
                int i = leftI;
                while (i <= rightI){
                    System.out.println("The spot where it starts is:" + flip.squarelotron[topI][i]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[(2*(midI - topI) - 1)+topI][i]);
                    int before = flip.squarelotron[topI][i];
                    flip.squarelotron[topI][i] = flip.squarelotron[(2*(midI - topI) - 1)+topI][i];
                    flip.squarelotron[(2*(midI - topI) - 1)+topI][i] = before;
                    System.out.println("The spot where it starts is:" + flip.squarelotron[topI][i]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[(2*(midI - topI) - 1)+topI][i]);
                    i++;
                }
                System.out.println("top left - Index -> Down");
                i = topI + 1;
                
                while (i <= midI - 1){
                    System.out.println("The spot where it starts is:" + flip.squarelotron[i][leftI]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[((2*(midI - i)-1)+i)][leftI]);
                    int before = flip.squarelotron[i][leftI];
                    flip.squarelotron[i][leftI] = flip.squarelotron[((2*(midI - i)-1)+i)][leftI];
                    flip.squarelotron[((2*(midI - i)-1)+i)][leftI] = before;
                    System.out.println("The spot where it starts is:" + flip.squarelotron[i][leftI]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[((2*(midI - i)-1)+i)][leftI]);
                    i++;
                }
                System.out.println("top right - Index -> Down");
                i = topI + 1;
                while (i <= midI - 1){
                    System.out.println("The spot where it starts is:" + flip.squarelotron[i][rightI]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[((2*(midI - i)-1)+i)][rightI]);
                    int before = flip.squarelotron[i][rightI];
                    flip.squarelotron[i][rightI] = flip.squarelotron[((2*(midI - i)-1)+i)][rightI];
                    flip.squarelotron[((2*(midI - i)-1)+i)][rightI] = before;
                    System.out.println("The spot where it starts is:" + flip.squarelotron[i][rightI]);
                    System.out.println("The spot where its supposed to end is:" + flip.squarelotron[((2*(midI - i)-1)+i)][rightI]);
                    i++;

                }
                flip.printSquarelotron();
            
        }
            else{
                System.out.println("The ring size does not match the amount of rings in this squarelotron");
            }
            
        }
        //odd cases
        else{
            if(ringSize >= ring){
                
        }
            else{
                System.out.println("The ring size does not match the amount of rings in this squarelotron");
            }
            
        }
                
        
        //flip.printSquarelotron();
        return flip;
        
        

    }
    
    public Squarelotron mainDiagonalFlip(int ring){
        return null;
    }
    
    public void rotateRight(int numberOfTurns){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Squarelotron game = new Squarelotron(6);
        game.printSquarelotron();
        game.upsideDownFlip(1);
        
        //game.printSquarelotron();
        // TODO code application logic here
    }
    
}
