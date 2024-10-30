package com.aluracursos.literatura.model;

public enum Idioma {
    es("Español"),
    en("Inglés"),
    fr("Francés"),
    pt("Portugués"),
    nd("No disponible"),
    ;

    //Guarda el nombre completo del idioma
    private String idiomaCompleto;

    //Recibe el nombre completo del idioma, lo asigna a la propiedad por lo que
    //cada valor de idioma tiene el nombre completo
    Idioma(String idiomaCompleto){
        this.idiomaCompleto=idiomaCompleto;
    }

    public static Idioma stringToEnum(String idioma){
        //Convierte los posibles valores en un valor de tipo Idioma
        for(Idioma item:Idioma.values()){
            if(item.name().equalsIgnoreCase(idioma)){
                return item;
            }
        }
        return nd;
    }

    public static void listarIdiomas(){
        for (Idioma idioma:Idioma.values()){
            System.out.println(idioma.name()+" - "+idioma.getIdiomaCompleto());
        }
    }

    public String getIdiomaCompleto() {
        return idiomaCompleto;
    }
}
