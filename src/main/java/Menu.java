import java.util.*;
class Menu {
    public void display_menu() {
        System.out.println ( "1) Sign in \n2) Get started" );
        System.out.print ( "Selection: " );
    }

    public Menu() {
        Scanner in = new Scanner ( System.in );

        display_menu();
        switch ( in.nextInt() ) {
            case 1:
                System.out.println ( "You picked option 1" );
                System.out.println(" Enter your login");
                Scanner login = new Scanner ( System.in );
                System.out.println(" Enter your password");
                Scanner password = new Scanner ( System.in );
                break;
            case 2:
                System.out.println ( "You picked option 2" );
                System.out.println(" Enter your login");
                Scanner newLogin = new Scanner ( System.in );
                System.out.println(" Enter your email");
                Scanner newEmail = new Scanner ( System.in );
                System.out.println(" Enter your password");
                Scanner newPassword = new Scanner ( System.in );
                break;
            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }
}