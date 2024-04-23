package com.easynotes.view.logoutview;

import com.easynotes.utils.security.CustomUserDetailsService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;


@Route("logout")
@PageTitle("Logout")
@PermitAll
public class LogoutView extends HorizontalLayout {

    public LogoutView(CustomUserDetailsService userDetailsService) {

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.add(new H1("Do you want to log out form EasyNotes???"));

        Button logoutButton = new Button("Logout");
        logoutButton.addClickListener(e -> userDetailsService.logout());
        logoutButton.setIcon(VaadinIcon.ARROW_LONG_LEFT.create());
        logoutButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        verticalLayout.add(logoutButton);
        verticalLayout.setAlignItems(Alignment.CENTER);

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        add(verticalLayout);
    }
}
