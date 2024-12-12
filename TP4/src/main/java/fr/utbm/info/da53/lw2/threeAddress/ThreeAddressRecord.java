package fr.utbm.info.da53.lw2.threeAddress;


/**
 * The ThreeAddressRecord class represents a single line of three-address code.
 *
 * @author erenon;
 * @version $Name$ $Revision$ $Date$
 */
public class ThreeAddressRecord {

    private String instruction;

    private String param1;

    private String param2;

    private String result;

    private String label;

    private String comment;

    /**
     * Constructor
     *
     * @param instruction is the instruction
     * @param param1 is the first parameter
     * @param param2 is the second parameter
     * @param result is the result
     * @param label is the label
     * @param comment is the comment
     */
    public ThreeAddressRecord(String instruction, String param1, String param2, String result, String label, String comment) {
        this.instruction = instruction;
        this.param1 = param1;
        this.param2 = param2;
        this.result = result;
        this.label = label;
        this.comment = comment;
    }

    /**
     * Constructor
     *
     * @param instruction is the instruction
     * @param param1 is the first parameter
     * @param param2 is the second parameter
     * @param result is the result
     */
    public ThreeAddressRecord(String instruction, String param1, String param2, String result) {
        this.instruction = instruction;
        this.param1 = param1;
        this.param2 = param2;
        this.result = result;
    }

    /**
     * Get the instruction
     *
     * @return the instruction
     */
    public String getInstruction() {
        return instruction;
    }

    /**
     * Set the instruction
     *
     * @param instruction is the instruction
     */
    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    /**
     * Get the param1
     *
     * @return the param1
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Set the param1
     *
     * @param param1 is the param1
     */
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * Get the param2
     *
     * @return the param2
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Set the param2
     *
     * @param param2 is the param2
     */
    public void setParam2(String param2) {
        this.param2 = param2;
    }

    /**
     * Get the result
     *
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Set the result
     *
     * @param result is the result
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Get the label
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Set the label
     *
     * @param label is the label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Get the comment
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Set the comment
     *
     * @param comment is the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (label != null) sb.append(label).append(": ");
        sb.append(instruction).append(" ");
        if (param1 != null) sb.append(param1).append(" ");
        if (param2 != null) sb.append(param2).append(" ");
        if (result != null) sb.append("-> ").append(result);
        if (comment != null) sb.append(" // ").append(comment);
        return sb.toString();
    }

}
