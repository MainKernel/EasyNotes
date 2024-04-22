package com.easynotes.view.forgotpasswordview;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route("forgotten-password")
@PageTitle("Password restore")
@Theme(Lumo.DARK)
@AnonymousAllowed
public class ForgottenPasswordView extends VerticalLayout implements AppShellConfigurator {

    public ForgottenPasswordView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(new H1("Password restore will be available soon...."));
    }
}
