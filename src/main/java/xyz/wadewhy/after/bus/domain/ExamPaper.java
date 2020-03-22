package xyz.wadewhy.after.bus.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamPaper {
    private Exam exam;//考试实体
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.examId
     *
     * @mbg.generated
     */
    private Integer examid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.studentId
     *
     * @mbg.generated
     */
    private Integer studentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.totalScore
     *
     * @mbg.generated
     */
    private Integer totalscore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.score
     *
     * @mbg.generated
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.startExamTime
     *
     * @mbg.generated
     */
    private Date startexamtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.endExamTime
     *
     * @mbg.generated
     */
    private Date endexamtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.useTime
     *
     * @mbg.generated
     */
    private Integer usetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bus_exampaper.createTime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.id
     *
     * @return the value of bus_exampaper.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.id
     *
     * @param id the value for bus_exampaper.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.examId
     *
     * @return the value of bus_exampaper.examId
     *
     * @mbg.generated
     */
    public Integer getExamid() {
        return examid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.examId
     *
     * @param examid the value for bus_exampaper.examId
     *
     * @mbg.generated
     */
    public void setExamid(Integer examid) {
        this.examid = examid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.studentId
     *
     * @return the value of bus_exampaper.studentId
     *
     * @mbg.generated
     */
    public Integer getStudentid() {
        return studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.studentId
     *
     * @param studentid the value for bus_exampaper.studentId
     *
     * @mbg.generated
     */
    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.status
     *
     * @return the value of bus_exampaper.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.status
     *
     * @param status the value for bus_exampaper.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.totalScore
     *
     * @return the value of bus_exampaper.totalScore
     *
     * @mbg.generated
     */
    public Integer getTotalscore() {
        return totalscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.totalScore
     *
     * @param totalscore the value for bus_exampaper.totalScore
     *
     * @mbg.generated
     */
    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.score
     *
     * @return the value of bus_exampaper.score
     *
     * @mbg.generated
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.score
     *
     * @param score the value for bus_exampaper.score
     *
     * @mbg.generated
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.startExamTime
     *
     * @return the value of bus_exampaper.startExamTime
     *
     * @mbg.generated
     */
    public Date getStartexamtime() {
        return startexamtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.startExamTime
     *
     * @param startexamtime the value for bus_exampaper.startExamTime
     *
     * @mbg.generated
     */
    public void setStartexamtime(Date startexamtime) {
        this.startexamtime = startexamtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.endExamTime
     *
     * @return the value of bus_exampaper.endExamTime
     *
     * @mbg.generated
     */
    public Date getEndexamtime() {
        return endexamtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.endExamTime
     *
     * @param endexamtime the value for bus_exampaper.endExamTime
     *
     * @mbg.generated
     */
    public void setEndexamtime(Date endexamtime) {
        this.endexamtime = endexamtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.useTime
     *
     * @return the value of bus_exampaper.useTime
     *
     * @mbg.generated
     */
    public Integer getUsetime() {
        return usetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.useTime
     *
     * @param usetime the value for bus_exampaper.useTime
     *
     * @mbg.generated
     */
    public void setUsetime(Integer usetime) {
        this.usetime = usetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bus_exampaper.createTime
     *
     * @return the value of bus_exampaper.createTime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bus_exampaper.createTime
     *
     * @param createtime the value for bus_exampaper.createTime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}