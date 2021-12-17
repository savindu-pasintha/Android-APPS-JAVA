package spl.support.layoutdatabinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Contact {
    public String firstName,lastName;
    public Contact(String fn,String ln){
        this.firstName=fn; this.lastName=ln;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  /*  //click event
    private Context contex;
    public Contact(Context context){this.contex = context;}

    public void getValueClick(View view){
        Toast.makeText(contex, "Contact class click method : ", Toast.LENGTH_LONG).show();
    }
    public void getValueLongClick(View view){
        Toast.makeText(contex, "Long click method : ", Toast.LENGTH_LONG).show();
    }
    public void getValueLongClickWithParameter(View view,Contact contact){
        if (view.getId() == R.id.button3) {
            Toast.makeText(contex, "get click with parameeter : " + contact.firstName + "-" + contact.lastName, Toast.LENGTH_LONG).show();
        }
    }

   */
}
