import java.io.*;
/** This class will initialize all the objects and allow
 * the game to begin.  If you want to cheat, do it here!
 * 
 * @author 04chante
 */
public class Main {

    /** This class will initialize all the objects and allow
     * the game to begin.  If you want to cheat, do it here!
     * 
     * @param args the command line arguments
     * @exception IOException if not able to read name, throw this exception
     */
    public static void main(String[] args)throws IOException {
        
        String name;
        System.out.println("Welcome warrior, Please state your name \n");
        
        //************ DO NOT TOUCH *******************//
        // Hook up br to standard input.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
        String decide;
        decide = br.readLine();
        //*********** ENTER MAIN PROGRAM HERE **************//
    
        name = decide;
        
        Hero hero = new Hero(name, 50, 50);
        hero.addGold(1000);
        
        System.out.println("Enter your story here");
        System.out.println("\nPrepare for your adventure\n");
        
        Monster simpleMonster = new Monster("easyLa", 5, 20, 1, 10, 10);
        Monster BossMonster = new Monster("HardLa", 50, 500, 10, 1000, 10);
        
        Weapon shortsword = new Weapon("short sword", 10, 100);
        Weapon godlySword = new Weapon("Godly sword", 100, 1000);
        
        Store store1 = new Store(shortsword.getWorth(), shortsword, hero);
        Store store2 = new Store(godlySword.getWorth(), godlySword, hero);
        
        Map noobArea = new Map("Noob Area", store1, simpleMonster);
        Map BossArea = new Map("Boss Area", store2, BossMonster);
        
        Game game = new Game(hero, simpleMonster, BossMonster, noobArea, BossArea);
        game.actualGameLoop(); 
    }

}
