package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Prerequirement;

public class PrerequirementDto {

    private  int id;
     private SubjectDto subjectDto, prerequirementDto;
    public PrerequirementDto(){
     }


    public PrerequirementDto(int id, SubjectDto subject, SubjectDto prerequirement) {
        this.id = id;
        this.subjectDto = subject;
        this.prerequirementDto = prerequirement;
    }

    public PrerequirementDto(Prerequirement prerequirement){
        this.id=prerequirement.getId();
        this.subjectDto = new SubjectDto(prerequirement.getSubject());
        this.prerequirementDto= new SubjectDto(prerequirement.getPrerequirement());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectDto getSubject() {
        return subjectDto;
    }

    public void setSubject(SubjectDto subject) {
        this.subjectDto = subjectDto;
    }

    public SubjectDto getPrerequirement() {
        return prerequirementDto;
    }

    public void setPrerequirement(SubjectDto prerequirement) {
        this.prerequirementDto = prerequirementDto;
    }

}
