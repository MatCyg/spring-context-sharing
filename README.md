
1. Run non-shared context with mock beans:
```shell
mvn '-Dtest=com.mc.contextcaching.nonshared_mockbean.*Test' test
```

2. Run non-shared context with test configuration per test:
```shell
mvn '-Dtest=com.mc.contextcaching.nonshared_testconfiguration.*Test' test
```

3. Run shared context with shared test configuration:
```shell
mvn '-Dtest=com.mc.contextcaching.shared.*Test' test
```
