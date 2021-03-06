/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.phpunit.options;

import org.netbeans.modules.php.api.validation.ValidationResult;
import org.netbeans.modules.php.phpunit.commands.SkeletonGenerator;
import org.netbeans.modules.php.phpunit.util.PhpUnitUtils;

/**
 * Validator for PhpUnit options.
 */
public final class PhpUnitOptionsValidator {

    private final ValidationResult result = new ValidationResult();


    public PhpUnitOptionsValidator validate(String phpUnitPath, String skeletnGeneratorPath) {
        validatePhpUnitPath(phpUnitPath);
        validateSkeletonGeneratorPath(skeletnGeneratorPath);
        return this;
    }

    public ValidationResult getResult() {
        return result;
    }

    public PhpUnitOptionsValidator validatePhpUnitPath(String phpUnitPath) {
        String warning = PhpUnitUtils.validatePhpUnitPath(phpUnitPath);
        if (warning != null) {
            result.addWarning(new ValidationResult.Message("phpUnitPath", warning)); // NOI18N
        }
        return this;
    }

    private PhpUnitOptionsValidator validateSkeletonGeneratorPath(String skeletonGeneratorPath) {
        String warning = SkeletonGenerator.validate(skeletonGeneratorPath);
        if (warning != null) {
            result.addWarning(new ValidationResult.Message("skeletonGeneratorPath", warning)); // NOI18N
        }
        return this;
    }

}
