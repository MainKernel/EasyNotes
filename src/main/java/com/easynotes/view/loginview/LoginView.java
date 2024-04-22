package com.easynotes.view.loginview;

import com.easynotes.model.entity.view.LoginForm;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;

/**
 * @author mightyloot
 */

@Route("login")
@PageTitle("Login")
@AnonymousAllowed
public class LoginView extends FlexLayout {

    private final Image logo = new Image("classpath:images/EasyNotesLogoWhite.png", "EasyNotes");
    private final TextField login = new TextField("Login", "JDou");
    private final PasswordField password = new PasswordField("Password", "password");
    Binder<LoginForm> binder = new BeanValidationBinder<>(LoginForm.class);

    public LoginView() {


    }
}
