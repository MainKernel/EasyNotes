package com.easynotes.view.profileview;

import com.easynotes.view.baseview.EasyNotesAppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@Route(value = "profile", layout = EasyNotesAppLayout.class)
@PageTitle("Profile")
@RolesAllowed({"USER", "ADMIN"})
public class ProfileView extends VerticalLayout {
    public ProfileView() {
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setAlignItems(Alignment.CENTER);
        add(new H1("Profile feature coming soon...."));
    }

}
