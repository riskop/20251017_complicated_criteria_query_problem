----------------------------

CREATE TABLE PE
(
    "SU_ID" NUMBER,
    "K" VARCHAR2(40),
    primary key (su_id)
);

CREATE TABLE SU
(
    "SU_ID" NUMBER,
    "TYPE" VARCHAR2(30),
    primary key (su_id)
);

CREATE TABLE PR
(	"PR_ID" NUMBER,
     "PR_NUM" NUMBER,
     primary key (pr_id)
);

CREATE TABLE PR_PA
(
     "PA_ID" NUMBER,
     "PR_ID" NUMBER,
     "SU_ID" NUMBER,
     "PR_ROLE" VARCHAR2(255),
     primary key (PR_ID)
);

INSERT INTO SU (SU_ID, TYPE) VALUES (1, 'PERSON');
INSERT INTO SU (SU_ID, TYPE) VALUES (2, 'PERSON');

INSERT INTO PE (SU_ID, K) VALUES (1, 'first');
INSERT INTO PE (SU_ID, K) VALUES (2, 'second');

INSERT INTO PR (PR_ID, PR_NUM) VALUES (1, 111);
INSERT INTO PR_PA (PA_ID, PR_ID, SU_ID, PR_ROLE) VALUES (1, 1, 1, 'C');
