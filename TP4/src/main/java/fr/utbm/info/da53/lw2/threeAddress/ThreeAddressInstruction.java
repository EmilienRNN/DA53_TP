package fr.utbm.info.da53.lw2.threeAddress;

/**
 * List of the three address instructions.
 *
 * @author erenon
 * @version $Name$ $Revision$ $Date$
 */
public enum ThreeAddressInstruction {

    /// Addition
    ADD,

    /// Subtraction
    SUB,

    /// Multiplication
    MULT,

    /// Division
    DIV,

    /// Less Than
    LT,

    /// Less Than or Equal
    LE,

    /// Equal
    EQ,

    /// Not Equal
    NE,

    /// Greater Than
    GT,

    /// Greater Than or Equal
    GE,

    /// JUMP: Unconditional jump to a instruction address.
    JUMP,

    /// CALL: Call a subroutine or function by jumping to its entry point.
    CALL,

    /// RETURN: Return control to the calling function or point after a subroutine ends.
    RETURN,

    /// EXIT: Terminate the program execution entirely.
    EXIT,

    /// ASSIGN: Assign the result of an expression to a variable.
    ASSIGN,


}
