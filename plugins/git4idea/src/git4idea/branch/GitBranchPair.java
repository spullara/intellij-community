/*
 * Copyright 2000-2011 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package git4idea.branch;

import git4idea.GitBranch;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Holder for Git branch and the branch it is "connected" with. It is tracked branch or so called "matched" branch.
 *
 * @author Kirill Likhodedov
 */
public class GitBranchPair {
  private @NotNull GitBranch myBranch;
  private @Nullable GitBranch myDestBranch;

  public GitBranchPair(@NotNull GitBranch branch, @Nullable GitBranch destination) {
    myBranch = branch;
    myDestBranch = destination;
  }

  public @NotNull GitBranch getBranch() {
    return myBranch;
  }

  public @Nullable GitBranch getDest() {
    return myDestBranch;
  }

}
