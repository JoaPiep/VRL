/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eu.mihosoft.vrl.instrumentation;


/**
 *
 * @author Michael Hoffer &lt;info@michaelhoffer.de&gt;
 */
public interface Comment extends CodeEntity{
    public void setComment(String comment);
    public String getComment();
    public void setType(CommentType type);
    public CommentType getType();
}