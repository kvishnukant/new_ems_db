var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":34,"methods":[{"el":16,"sc":2,"sl":13},{"el":30,"sc":2,"sl":28},{"el":34,"sc":2,"sl":32},{"el":38,"sc":2,"sl":36},{"el":42,"sc":2,"sl":40},{"el":46,"sc":2,"sl":44},{"el":50,"sc":2,"sl":48}],"name":"EmployeeCommand","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":13},{"sl":32},{"sl":40},{"sl":48}],"name":"testUpdateEmployee","pass":true,"statements":[{"sl":14},{"sl":33},{"sl":41},{"sl":49}]},"test_1":{"methods":[{"sl":13},{"sl":32},{"sl":40},{"sl":48}],"name":"findById","pass":true,"statements":[{"sl":14},{"sl":33},{"sl":41},{"sl":49}]},"test_2":{"methods":[{"sl":13},{"sl":28},{"sl":32},{"sl":36},{"sl":40},{"sl":44},{"sl":48}],"name":"testAddEmployee","pass":true,"statements":[{"sl":14},{"sl":29},{"sl":33},{"sl":37},{"sl":41},{"sl":45},{"sl":49}]},"test_4":{"methods":[{"sl":13},{"sl":32},{"sl":40},{"sl":48}],"name":"testGetEmployeeById","pass":true,"statements":[{"sl":14},{"sl":33},{"sl":41},{"sl":49}]},"test_7":{"methods":[{"sl":13},{"sl":32},{"sl":40},{"sl":48}],"name":"testGetEmployeeById","pass":true,"statements":[{"sl":14},{"sl":33},{"sl":41},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1, 2, 7, 4, 0], [1, 2, 7, 4, 0], [], [], [], [], [], [], [], [], [], [], [], [], [], [2], [2], [], [], [1, 2, 7, 4, 0], [1, 2, 7, 4, 0], [], [], [2], [2], [], [], [1, 2, 7, 4, 0], [1, 2, 7, 4, 0], [], [], [2], [2], [], [], [1, 2, 7, 4, 0], [1, 2, 7, 4, 0], [], [], []]
