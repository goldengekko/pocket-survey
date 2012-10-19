package com.wadpam.survey.domain;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import net.sf.mardao.core.domain.AbstractLongEntity;

/**
 *
 * @author os
 */
@Entity
public class DAnswer extends AbstractLongEntity {
    
    /** The type of the answer is given by the question */
    @Basic
    private Object answer;

    /** The question this answer is for */
    @ManyToOne
    private DQuestion question;
    
    /** The response this answer is for */
    @ManyToOne
    private DResponse response;
    
    /** The survey this answer is related to */
    @ManyToOne
    private DSurvey survey;
    
    public DResponse getResponse() {
        return response;
    }

    public void setResponse(DResponse response) {
        this.response = response;
    }

    public Object getAnswer() {
        return answer;
    }

    public void setAnswer(Object answer) {
        this.answer = answer;
    }
    
    public DSurvey getSurvey() {
        return survey;
    }

    public void setSurvey(DSurvey survey) {
        this.survey = survey;
    }

    public DQuestion getQuestion() {
        return question;
    }

    public void setQuestion(DQuestion question) {
        this.question = question;
    }

}