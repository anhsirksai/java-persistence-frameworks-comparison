/**
 * This class is generated by jOOQ
 */
package com.clevergang.dbtests.repository.impl.jooq.generated;


import com.clevergang.dbtests.repository.impl.jooq.generated.tables.*;
import com.clevergang.dbtests.repository.impl.jooq.generated.tables.records.*;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CompanyRecord, Integer> IDENTITY_COMPANY = Identities0.IDENTITY_COMPANY;
    public static final Identity<DepartmentRecord, Integer> IDENTITY_DEPARTMENT = Identities0.IDENTITY_DEPARTMENT;
    public static final Identity<EmployeeRecord, Integer> IDENTITY_EMPLOYEE = Identities0.IDENTITY_EMPLOYEE;
    public static final Identity<ProjectRecord, Integer> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CompanyRecord> COMPANY_PKEY = UniqueKeys0.COMPANY_PKEY;
    public static final UniqueKey<CompanyRecord> COMPANY_NAME_KEY = UniqueKeys0.COMPANY_NAME_KEY;
    public static final UniqueKey<DepartmentRecord> DEPARTMENT_PKEY = UniqueKeys0.DEPARTMENT_PKEY;
    public static final UniqueKey<EmployeeRecord> EMPLOYEE_PKEY = UniqueKeys0.EMPLOYEE_PKEY;
    public static final UniqueKey<EmployeeRecord> EMPLOYEE_NAME_SURNAME_UNIQUE = UniqueKeys0.EMPLOYEE_NAME_SURNAME_UNIQUE;
    public static final UniqueKey<ProjectRecord> PROJECT_PKEY = UniqueKeys0.PROJECT_PKEY;
    public static final UniqueKey<ProjectemployeeRecord> PROJECTEMPLOYEE_PKEY = UniqueKeys0.PROJECTEMPLOYEE_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<DepartmentRecord, CompanyRecord> DEPARTMENT__DEPARTMENT_COMPANY_PID_FKEY = ForeignKeys0.DEPARTMENT__DEPARTMENT_COMPANY_PID_FKEY;
    public static final ForeignKey<EmployeeRecord, DepartmentRecord> EMPLOYEE__EMPLOYEE_DEPARTMENT_PID_FKEY = ForeignKeys0.EMPLOYEE__EMPLOYEE_DEPARTMENT_PID_FKEY;
    public static final ForeignKey<ProjectemployeeRecord, ProjectRecord> PROJECTEMPLOYEE__PROJECTEMPLOYEE_PROJECT_PID_FKEY = ForeignKeys0.PROJECTEMPLOYEE__PROJECTEMPLOYEE_PROJECT_PID_FKEY;
    public static final ForeignKey<ProjectemployeeRecord, EmployeeRecord> PROJECTEMPLOYEE__PROJECTEMPLOYEE_EMPLOYEE_PID_FKEY = ForeignKeys0.PROJECTEMPLOYEE__PROJECTEMPLOYEE_EMPLOYEE_PID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CompanyRecord, Integer> IDENTITY_COMPANY = createIdentity(Company.COMPANY, Company.COMPANY.PID);
        public static Identity<DepartmentRecord, Integer> IDENTITY_DEPARTMENT = createIdentity(Department.DEPARTMENT, Department.DEPARTMENT.PID);
        public static Identity<EmployeeRecord, Integer> IDENTITY_EMPLOYEE = createIdentity(Employee.EMPLOYEE, Employee.EMPLOYEE.PID);
        public static Identity<ProjectRecord, Integer> IDENTITY_PROJECT = createIdentity(Project.PROJECT, Project.PROJECT.PID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CompanyRecord> COMPANY_PKEY = createUniqueKey(Company.COMPANY, "company_pkey", Company.COMPANY.PID);
        public static final UniqueKey<CompanyRecord> COMPANY_NAME_KEY = createUniqueKey(Company.COMPANY, "company_name_key", Company.COMPANY.NAME);
        public static final UniqueKey<DepartmentRecord> DEPARTMENT_PKEY = createUniqueKey(Department.DEPARTMENT, "department_pkey", Department.DEPARTMENT.PID);
        public static final UniqueKey<EmployeeRecord> EMPLOYEE_PKEY = createUniqueKey(Employee.EMPLOYEE, "employee_pkey", Employee.EMPLOYEE.PID);
        public static final UniqueKey<EmployeeRecord> EMPLOYEE_NAME_SURNAME_UNIQUE = createUniqueKey(Employee.EMPLOYEE, "employee_name_surname_unique", Employee.EMPLOYEE.NAME, Employee.EMPLOYEE.SURNAME);
        public static final UniqueKey<ProjectRecord> PROJECT_PKEY = createUniqueKey(Project.PROJECT, "project_pkey", Project.PROJECT.PID);
        public static final UniqueKey<ProjectemployeeRecord> PROJECTEMPLOYEE_PKEY = createUniqueKey(Projectemployee.PROJECTEMPLOYEE, "projectemployee_pkey", Projectemployee.PROJECTEMPLOYEE.PROJECT_PID, Projectemployee.PROJECTEMPLOYEE.EMPLOYEE_PID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<DepartmentRecord, CompanyRecord> DEPARTMENT__DEPARTMENT_COMPANY_PID_FKEY = createForeignKey(com.clevergang.dbtests.repository.impl.jooq.generated.Keys.COMPANY_PKEY, Department.DEPARTMENT, "department__department_company_pid_fkey", Department.DEPARTMENT.COMPANY_PID);
        public static final ForeignKey<EmployeeRecord, DepartmentRecord> EMPLOYEE__EMPLOYEE_DEPARTMENT_PID_FKEY = createForeignKey(com.clevergang.dbtests.repository.impl.jooq.generated.Keys.DEPARTMENT_PKEY, Employee.EMPLOYEE, "employee__employee_department_pid_fkey", Employee.EMPLOYEE.DEPARTMENT_PID);
        public static final ForeignKey<ProjectemployeeRecord, ProjectRecord> PROJECTEMPLOYEE__PROJECTEMPLOYEE_PROJECT_PID_FKEY = createForeignKey(com.clevergang.dbtests.repository.impl.jooq.generated.Keys.PROJECT_PKEY, Projectemployee.PROJECTEMPLOYEE, "projectemployee__projectemployee_project_pid_fkey", Projectemployee.PROJECTEMPLOYEE.PROJECT_PID);
        public static final ForeignKey<ProjectemployeeRecord, EmployeeRecord> PROJECTEMPLOYEE__PROJECTEMPLOYEE_EMPLOYEE_PID_FKEY = createForeignKey(com.clevergang.dbtests.repository.impl.jooq.generated.Keys.EMPLOYEE_PKEY, Projectemployee.PROJECTEMPLOYEE, "projectemployee__projectemployee_employee_pid_fkey", Projectemployee.PROJECTEMPLOYEE.EMPLOYEE_PID);
    }
}
