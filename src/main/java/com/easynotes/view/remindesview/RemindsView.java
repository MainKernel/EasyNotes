package com.easynotes.view.remindesview;

import com.easynotes.utils.VerificationCodeGenerator;
import com.easynotes.view.baseview.EasyNotesAppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;
import jakarta.annotation.security.RolesAllowed;

@Route(value = "reminders", layout = EasyNotesAppLayout.class)
@PageTitle("Reminds")
@PermitAll
public class RemindsView extends VerticalLayout {

    public RemindsView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(new H1("Reminds feature will be available soon...."));
    }
}
