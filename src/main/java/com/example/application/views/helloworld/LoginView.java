// edit in order to upload 2
package com.example.application.views.helloworld;


import com.example.application.views.MainLayout;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Login")
@Route(value = "login", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class LoginView extends HorizontalLayout {

    private TextField username;
    private String u;
    private PasswordField password;
    private String p;
    private Button Login;


    public LoginView() {
        username = new TextField("username");
        password =new PasswordField("password");
        Login = new Button("Login");

        Login.addClickListener(e -> {
            u = username.getValue();
            p = password.getValue();
            if ((u.equals("doctor1")) && (p.equals("password1"))){
            Notification.show("Logging in "+ u );
            UI.getCurrent().getPage().executeJavaScript("window.open(\"http://vaadin.com/\", \"_self\");");
            }
        });

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, username,password, Login);

        add(username,password, Login);
    }

}
