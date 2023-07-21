import subprocess

# List of subprojects
subprojects = [
    ('detekt-api', ''),
    ('detekt-cli', ''),
    ('detekt-psi-utils', '--testing-framework=junit-5'),
    ('detekt-core', '--testing-framework=junit-5'),
    ('detekt-utils', ''),
    ('detekt-tooling', ''),
    ('detekt-generator', ''),
    ('detekt-formatting', ''),
    ('detekt-metrics', '--testing-framework=junit-5'),
    ('detekt-parser', ''),
    ('detekt-report-txt', ''),
    ('detekt-report-html', '--testing-framework=junit-5'),
    ('detekt-report-md', '--testing-framework=junit-5'),
    ('detekt-report-xml', ''),
    ('detekt-report-sarif', ''),
    ('detekt-rules-empty', ''),
    ('detekt-rules-naming', ''),
    ('detekt-rules-style', '--testing-framework=junit-5'),
    ('detekt-rules-complexity', ''),
    ('detekt-rules-documentation', ''),
    ('detekt-rules-libraries', ''),
    ('detekt-rules-exceptions', ''),
    ('detekt-rules-performance', ''),
    ('detekt-rules-ruleauthors', ''),
    ('detekt-rules-errorprone', ''),
    ('detekt-rules-coroutines', ''),
    ('detekt-sample-extensions', ''),
    ('detekt-test', ''),
    ('detekt-test-utils', ''),
]


for subproject_record in subprojects:
    subproject = subproject_record[0]
    additional = subproject_record[1]

    command_line_prefix = f"dcover  upload http://localhost:8080 --working-directory {subproject} --project {subproject}"
    subprocess.run(command_line_prefix, shell=True)

