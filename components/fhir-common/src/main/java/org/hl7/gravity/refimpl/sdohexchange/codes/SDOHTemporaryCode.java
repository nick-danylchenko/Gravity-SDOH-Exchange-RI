package org.hl7.gravity.refimpl.sdohexchange.codes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Mykhailo Stefantsiv
 */
@Getter
@RequiredArgsConstructor
public enum SDOHTemporaryCode {
  EMPLOYMENT_STATUS("employment-status", "Employment Status"),
  CONTACT_CODE("contact-entity", "Contact Entity"),
  QUESTIONNAIRE_CATEGORY("questionnaire-category", "Questionnaire Category"),
  RISK_QUESTIONNAIRE("risk-questionnaire", "Risk Questionnaire"),
  FEEDBACK_QUESTIONNAIRE("feedback-questionnaire", "Feedback Questionnaire"),
  PERSONAL_CHARACTERISTIC_CODE("personal-characteristic", "Personal Characteristic"),
  SELF_REPORTED_CODE("self-reported", "Self Reported"),
  DERIVED_SPECIFY_CODE("derived-specify", "Derived Specify");

  private final String code;
  private final String display;

  public static final String SYSTEM =
      "http://hl7.org/fhir/us/sdoh-clinicalcare/CodeSystem/SDOHCC-CodeSystemTemporaryCodes";
}
