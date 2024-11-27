package com.example.calculationview;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class CalculationViewGenerator {
    public static void main(String[] args) {
        CalculationView view = new CalculationView();
        view.setName("SampleCalculationView");
        view.setDescription("This is a sample calculation view.");

        try {
            JAXBContext context = JAXBContext.newInstance(CalculationView.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(view, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}