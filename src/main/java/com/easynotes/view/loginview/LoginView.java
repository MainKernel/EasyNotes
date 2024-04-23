package com.easynotes.view.loginview;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.login.LoginForm;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.server.auth.AnonymousAllowed;



/**
 * @author mightyloot
 */

@Route("login")
@PageTitle("Login")
@AnonymousAllowed
public class LoginView extends VerticalLayout implements BeforeEnterObserver {
    private final LoginForm login = new LoginForm();

    public LoginView() {
        Button registrationButton = new Button("Registration");
        registrationButton.addClickListener(e -> getUI().ifPresent(ui -> ui.navigate("registration")));
        registrationButton.setIcon(VaadinIcon.RECORDS.create());
        registrationButton.setWidth("300px");
        registrationButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        addClassName("login-view");
        setSizeFull();


        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        login.addForgotPasswordListener(event -> getUI().ifPresent(ui -> ui.navigate("/forgotten-password")));

        add(new H1("EasyNotes"), login);
        login.setAction("login");

        add(login);
        add(registrationButton);

    }
    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        // inform the user about an authentication error
        if(beforeEnterEvent.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")) {
            login.setError(true);
        }
    }

}