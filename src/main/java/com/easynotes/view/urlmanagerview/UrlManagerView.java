package com.easynotes.view.urlmanagerview;

import com.easynotes.view.baseview.EasyNotesAppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@Route(value = "urls", layout = EasyNotesAppLayout.class)
@PageTitle("Url Manager")
@RolesAllowed({"USER", "ADMIN"})
public class UrlManagerView extends VerticalLayout {

    public UrlManagerView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(new H1("Url management features will be available soon...."));
    }
}
