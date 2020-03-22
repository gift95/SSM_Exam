package xyz.wadewhy.after.bus.domain;

import java.util.Date;

public class Question {
    //试题类型定义
    public static int QUESTION_TYPE_SINGLE = 0;//单选题型
    public static int QUESTION_TYPE_MUILT = 1;//多选题型
    public static int QUESTION_TYPE_CHARGE = 2;//判断题型
    public static int QUESTION_TYPE_WRITER = 3;//问答题型
    //试题分值定义，根据试题类型定义分值
    public static int QUESTION_TYPE_SINGLE_SCORE = 2;//单选题型，每题2分
    public static int QUESTION_TYPE_MUILT_SCORE = 4;//多选题型,每题4分
    public static int QUESTION_TYPE_CHARGE_SCORE = 2;//判断题型,每题两分
    public static int QUESTION_TYPE_WRITER_SCORE = 4;//问答题型,每题4分
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.subjectId
     *
     * @mbg.generated
     */
    private Integer subjectid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.bus_type
     *
     * @mbg.generated
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.answer
     *
     * @mbg.generated
     */
    private String answer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.createTime
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_question.option
     *
     * @mbg.generated
     */
    private String options;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.id
     *
     * @return the value of bus_question.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.id
     *
     * @param id the value for bus_question.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.subjectId
     *
     * @return the value of bus_question.subjectId
     *
     * @mbg.generated
     */
    public Integer getSubjectid() {
        return subjectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.subjectId
     *
     * @param subjectid the value for bus_question.subjectId
     *
     * @mbg.generated
     */
    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.bus_type
     *
     * @return the value of bus_question.bus_type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.bus_type
     *
     * @param type the value for bus_question.bus_type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.title
     *
     * @return the value of bus_question.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.title
     *
     * @param title the value for bus_question.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.score
     *
     * @return the value of bus_question.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.score
     *
     * @param score the value for bus_question.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.answer
     *
     * @return the value of bus_question.answer
     *
     * @mbg.generated
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.answer
     *
     * @param answer the value for bus_question.answer
     *
     * @mbg.generated
     */
    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.createTime
     *
     * @return the value of bus_question.createTime
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.createTime
     *
     * @param createTime the value for bus_question.createTime
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_question.option
     *
     * @return the value of bus_question.option
     *
     * @mbg.generated
     */
    public String getOptions() {
        return options;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_question.option
     *
     * @param options the value for bus_question.option
     *
     * @mbg.generated
     */
    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", subjectid=" + subjectid +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", score=" + score +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                ", options='" + options + '\'' +
                '}';
    }
    /**
     * 根据试题类型设置分值
     */
    public void setScoreByType(){
        if(type == QUESTION_TYPE_SINGLE)score = QUESTION_TYPE_SINGLE_SCORE;
        if(type == QUESTION_TYPE_MUILT)score = QUESTION_TYPE_MUILT_SCORE;
        if(type == QUESTION_TYPE_CHARGE)score = QUESTION_TYPE_CHARGE_SCORE;
        if(type == QUESTION_TYPE_WRITER)score = QUESTION_TYPE_WRITER_SCORE;
    }
}