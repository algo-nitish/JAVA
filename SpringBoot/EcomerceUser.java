package SpringBoot;

public class EcomerceUser {

    public static class User {
        private String username;
        private String email;

        public User(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public void login() {
            System.out.println("User " + username + " is logged in.");
            System.out.println( email + " Email Correct");
        }
        
        public void showDashboard(){
         System.out.println(username + " user dashboard");
        }
    }

    public static class AdminUser extends User {

        public AdminUser(String username, String email) {
            super(username, email);
            System.out.println("Admin is managing products");
        }

        // You can override or add new methods here
        @Override
        public void showDashboard(){
         System.out.println("adminUser dashboard");
        }
    }


    public class Regularuser extends User{
      public Regularuser(String username, String email){
            super(username, email);
          
      }
      public void BrowseProducts(){
  System.out.println("Regular user is browsing");

      }
      @Override
      public void showDashboard(){
         System.out.println("regularuser dashboard");
        }
    }

    public class Selleruser extends User{
         public Selleruser(String username, String email){
         super(username,email);
         }

         public void addproducts(){
            System.out.println("Seller is add a new product");
         }
         @Override
         public void showDashboard(){
         System.out.println("selleruser dashboard");
        }
    }

    public static void main(String[] args) {
      //   User normalUser = new User("john_doe", "john@example.com");
      //   normalUser.login();

        AdminUser admin = new AdminUser("admin_joe", "admin@example.com");
        admin.login();
        admin.showDashboard();
    }
}
