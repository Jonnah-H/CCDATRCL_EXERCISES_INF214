public class Weapon {
    
    // Weapon attributes
  
    private static final String Radex = null;
    private static final String Boom = null;
    private static final String Lex = null;
    private static final String Mythic = null;
    private static final String Bud = null;
    private static final String Baam = null;
    private static final String Epic = null;
    private static final String Uncommon = null;
    private static final String Rick = null;
    private static String Brad;
    String Name; 
    int Damage;
    int Weight;
    String Rarity;
    String Description;

    // Weapon method
    public void WeaponDescription() {
        System.out.println("It is me" + Name + " and I am here to save you with my powerful " + Damage + " damage!");
    }

    // Weapon Class
    public static void main(String[] args) {
        
        Weapon shotgun = new Weapon();
        
        shotgun.Name = Lex;
        shotgun.Damage = 8;
        shotgun.Weight = 4;
        shotgun.Rarity = Mythic;
        shotgun.WeaponDescription();

        Weapon pistol = new Weapon();
        
        pistol.Name = Bud;
        pistol.Damage = 3;
        pistol.Weight = 1;
        pistol.Rarity = Uncommon;
        pistol.WeaponDescription();

        Weapon smg = new Weapon();
        
        smg.Name = Rick;
        smg.Damage = 6;
        smg.Weight = 3;
        smg.Rarity = Epic;
        smg.WeaponDescription();


    }

}
