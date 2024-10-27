package com.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentDetailsAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertStudentDetailsAllPropertiesEquals(StudentDetails expected, StudentDetails actual) {
        assertStudentDetailsAutoGeneratedPropertiesEquals(expected, actual);
        assertStudentDetailsAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertStudentDetailsAllUpdatablePropertiesEquals(StudentDetails expected, StudentDetails actual) {
        assertStudentDetailsUpdatableFieldsEquals(expected, actual);
        assertStudentDetailsUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertStudentDetailsAutoGeneratedPropertiesEquals(StudentDetails expected, StudentDetails actual) {
        assertThat(expected)
            .as("Verify StudentDetails auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertStudentDetailsUpdatableFieldsEquals(StudentDetails expected, StudentDetails actual) {
        assertThat(expected)
            .as("Verify StudentDetails relevant properties")
            .satisfies(e -> assertThat(e.getPhone()).as("check phone").isEqualTo(actual.getPhone()))
            .satisfies(e -> assertThat(e.getEmail()).as("check email").isEqualTo(actual.getEmail()))
            .satisfies(e -> assertThat(e.getAddress()).as("check address").isEqualTo(actual.getAddress()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertStudentDetailsUpdatableRelationshipsEquals(StudentDetails expected, StudentDetails actual) {
        // empty method
    }
}