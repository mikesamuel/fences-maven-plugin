# Fences Maven Enforcer Rule [<img src="https://travis-ci.org/mikesamuel/fences-maven-enforcer-rule.svg">](https://travis-ci.org/mikesamuel/fences-maven-enforcer-rule)

Augments Java's access control by checking that a Maven Project and all its
dependencies conform to a policy that specifies which classes/pacakges can
link to which others.

* [Background](src/site/markdown/background.md) explains who should use this and for what.
* [Caveats](src/site/markdown/caveats.md) explains what this can and can't do and some of the organizational security assumptions that went into its design.
* [Usage](src/site/markdown/usage.md) explains how to integrate into your Maven `<project>`.
* [Configuration](src/site/markdown/configuration.md) explains how to express a policy.
* [Policies](src/site/markdown/policies.md) explains how a policy is evaluated and how to write policies.
* [Alternatives](src/site/markdown/alternatives.md) relates this to other tools in the same space.
