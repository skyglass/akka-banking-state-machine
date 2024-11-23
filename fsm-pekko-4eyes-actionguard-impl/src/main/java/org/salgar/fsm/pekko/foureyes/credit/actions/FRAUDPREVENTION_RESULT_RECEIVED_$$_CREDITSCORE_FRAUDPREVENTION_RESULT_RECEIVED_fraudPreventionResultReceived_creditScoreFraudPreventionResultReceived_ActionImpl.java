package org.salgar.fsm.pekko.foureyes.credit.actions;

import org.apache.pekko.actor.typed.scaladsl.ActorContext;
import org.salgar.fsm.pekko.foureyes.credit.CreditSM;
import org.salgar.fsm.pekko.foureyes.credit.model.CreditTenantScoreResult;

import java.util.HashMap;
import java.util.Map;

import static org.salgar.fsm.pekko.foureyes.variables.PayloadVariableConstants.CREDIT_SCORE_TENANT_RESULTS;

public class FRAUDPREVENTION_RESULT_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_fraudPreventionResultReceived_creditScoreFraudPreventionResultReceived_ActionImpl
    extends FRAUDPREVENTION_RESULT_RECEIVED_$$_CREDITSCORE_FRAUDPREVENTION_RESULT_RECEIVED_fraudPreventionResultReceived_creditScoreFraudPreventionResultReceived_Action {

    @Override
    protected Map<String, Object> processCustomAction(ActorContext<CreditSM.CreditSMEvent> actorContext,
                                                        Map<String, Object> controlObject,
                                                        Map<String, Object> payload) {
        Map<String, Object> modifiedPayload = new HashMap<>();

        Map<String, CreditTenantScoreResult> creditTenantScoreResultMap =
                (Map<String, CreditTenantScoreResult>) payload.get(CREDIT_SCORE_TENANT_RESULTS);

        modifiedPayload.put(CREDIT_SCORE_TENANT_RESULTS, creditTenantScoreResultMap);

        return modifiedPayload;
    }
}