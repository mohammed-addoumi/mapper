DROP TABLE IF EXISTS "operation";
CREATE TABLE operation (
    id   INTEGER      NOT NULL,
    datePosition   DATE      NOT NULL,
    devise VARCHAR(128) NOT NULL,
    avoirBilan decimal,
    engagementBilan decimal,
    avoirSpotHorsBilan decimal,
    avoirTermeHorsBilan decimal,
    engagementSpoHorsBilan decimal,
    engagementTermeHorsBilan decimal,
    couverturePositionOptionnelle integer,
    equivalentDelta integer,
    totalPosition decimal,
    contreValeurPosition decimal,
    fondPropre decimal,
    PRIMARY KEY (id)
);