package com.example.demo.controlles;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.core.io.ClassPathResource;

import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.IOException;

@Named
public class ImageController {

    private String content;

    public StreamedContent getContent() throws IOException {
        ClassPathResource barbara = new ClassPathResource("META-INF/resources/images/barbara.jpg");
        return new DefaultStreamedContent(barbara.getInputStream(), "image/jpg");
    }

    public void setContent(String content) {
        this.content = content;
    }
}
