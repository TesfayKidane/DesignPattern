/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Tesfay
 */
public class ChainBuilder {

    private AbstractAgent handler;
    private static ChainBuilder chain = new ChainBuilder();

    private ChainBuilder() {
        buildChain();
    }

    public static ChainBuilder getChainBuilder() {
        return chain;
    }

    public AbstractAgent getHandler() {
        return handler;
    }

    private void buildChain() {
        AbstractAgent validator = new ValidatorAgent();
        AbstractAgent dataWahser = new DataWasherAgent();
        AbstractAgent reporterAgent = new ReporterAgent();
        validator.nextAgent = dataWahser;
        dataWahser.nextAgent = reporterAgent;
        handler = validator;

    }
}
