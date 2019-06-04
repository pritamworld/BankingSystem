
package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
   private String bankBranch;
   private String address;
   private int managerId;

   public Bank() {
   }

   public Bank(String bankBranch, String address, int managerId) {
      this.bankBranch = bankBranch;
      this.address = address;
      this.managerId = managerId;
   }

   public String getBankBranch() {
      return bankBranch;
   }

   public void setBankBranch(String bankBranch) {
      this.bankBranch = bankBranch;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public int getManagerId() {
      return managerId;
   }

   public void setManagerId(int managerId) {
      this.managerId = managerId;
   }
}
